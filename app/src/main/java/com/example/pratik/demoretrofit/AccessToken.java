package com.example.pratik.demoretrofit;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.parceler.Parcel;

/**
 * Created by pratik on 14/04/16.
 */
@Table(database = MyDatabase.class)
@Parcel(analyze = {AccessToken.class})
public class AccessToken extends BaseModel {

    @Column
    @PrimaryKey
    int pid;

    @Column
    public String id;
    @Column
    public long ttl;
    @Column
    public String created;
    @Column
    public long eId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public long geteId() {
        return eId;
    }

    public void seteId(long eId) {
        this.eId = eId;
    }

}
