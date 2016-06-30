package com.example.pratik.demoretrofit;

import org.parceler.Parcel;

/**
 * Created by pratik on 15/04/16.
 */
@Parcel
public class Files {

    public String FileName;
    public String Type;
    public String FilePath;
    public String localFilePath;
    public String thumbnail;
    public int progress;
    public int ConsumerProductDocumentID;
    public int ConsumerProductID;

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public String getLocalFilePath() {
        return localFilePath;
    }

    public void setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getConsumerProductDocumentID() {
        return ConsumerProductDocumentID;
    }

    public void setConsumerProductDocumentID(int consumerProductDocumentID) {
        ConsumerProductDocumentID = consumerProductDocumentID;
    }

    public int getConsumerProductID() {
        return ConsumerProductID;
    }

    public void setConsumerProductID(int consumerProductID) {
        ConsumerProductID = consumerProductID;
    }
}
