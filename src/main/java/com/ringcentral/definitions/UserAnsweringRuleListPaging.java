package com.ringcentral.definitions;


public class UserAnsweringRuleListPaging {
    /**
     * The current page number. 1-indexed, so the first page is 1 by default. May be omitted if result is empty (because non-existent page was specified or perPage=0 was requested)
     */
    public Long page;

    /**
     * The total number of pages in a dataset.
     */
    public Long totalPages;

    /**
     * Current page size, describes how many items are in each page. Default value is 100. Maximum value is 1000. If perPage value in the request is greater than 1000, the maximum value (1000) is applied
     */
    public Long perPage;

    /**
     * The total number of elements in a dataset.
     */
    public Long totalElements;

    /**
     * The zero-based number of the first element on the current page. Omitted if the page is omitted or result is empty
     */
    public Long pageStart;

    /**
     * The zero-based index of the last element on the current page. Omitted if the page is omitted or result is empty
     */
    public Long pageEnd;
}
