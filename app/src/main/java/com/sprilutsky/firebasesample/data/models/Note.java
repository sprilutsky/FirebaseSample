package com.sprilutsky.firebasesample.data.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
public class Note implements IModel {

    @SerializeName(fieldName = "note_id")
    private long noteId;

    @SerializeName(fieldName = "content")
    private String content;

    @SerializeName(fieldName = "group_id")
    private long groupId;

    @SerializeName(fieldName = "note_name")
    private String noteName;

    @SerializeName(fieldName = "user_id")
    private long userId;

    @SerializeName(fieldName = "note_order")
    private long noteOrder;

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getNoteOrder() {
        return noteOrder;
    }

    public void setNoteOrder(long noteOrder) {
        this.noteOrder = noteOrder;
    }

    public Map convertToMap() {
        Map<String, Object> data = new HashMap<>();
        data.put("note_id", this.noteId);
        data.put("content", this.content);
        data.put("group_id", this.groupId);
        data.put("note_name", this.noteName);
        data.put("user_id", this.userId);
        data.put("note_order", this.noteOrder);
        return data;
    }
}
