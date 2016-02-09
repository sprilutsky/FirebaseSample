package com.sprilutsky.firebasesample.data.models;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
public class Group implements IModel {

    @SerializeName(fieldName = "group_id")
    private int groupId;

    @SerializeName(fieldName = "group_name")
    private String groupName;

    @SerializeName(fieldName = "group_order")
    private int groupOrder;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(int groupOrder) {
        this.groupOrder = groupOrder;
    }
}
