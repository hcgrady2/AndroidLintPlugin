package com.hc.lintjavalib;


import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * 用于注册自定义的Lint规则
 *
 * @author liushuanggo@gmail.com
 * Time: 2019/4/13
 */
public class LintIssueRegistry extends IssueRegistry {
    @NotNull
    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(
                SimpleDetector.ISSUE,
                ClassCommentDetector.ISSUE,
                MessageDetector.ISSUE
        );
    }
}
