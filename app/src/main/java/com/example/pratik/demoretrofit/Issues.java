package com.example.pratik.demoretrofit;

import org.parceler.Parcel;

/**
 * Created by pratik on 15/04/16.
 */
@Parcel
public class Issues{
    public String IssueID;
    public String Issue;
    public String ProductSubCategoryIssueID;
    public String ConsumerServiceRequestIssuesID;

    public String getIssueID() {
        return IssueID;
    }

    public void setIssueID(String issueID) {
        IssueID = issueID;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String issue) {
        Issue = issue;
    }

    public String getProductSubCategoryIssueID() {
        return ProductSubCategoryIssueID;
    }

    public void setProductSubCategoryIssueID(String productSubCategoryIssueID) {
        ProductSubCategoryIssueID = productSubCategoryIssueID;
    }

    public String getConsumerServiceRequestIssuesID() {
        return ConsumerServiceRequestIssuesID;
    }

    public void setConsumerServiceRequestIssuesID(String consumerServiceRequestIssuesID) {
        ConsumerServiceRequestIssuesID = consumerServiceRequestIssuesID;
    }
}
