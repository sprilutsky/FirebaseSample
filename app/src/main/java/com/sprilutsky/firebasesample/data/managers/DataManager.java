package com.sprilutsky.firebasesample.data.managers;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.sprilutsky.firebasesample.data.models.Note;
import com.sprilutsky.firebasesample.data.models.SerializeName;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
public class DataManager {

    public List<Note> getNotes() {
        CloudDatabaseManager dbManager = new CloudDatabaseManager();
        Firebase notes = dbManager.getNoteEntity();
        notes.addValueEventListener(new NotesValuesEventListener());
        return null;
    }

    public void addNote(Map<String, Object> data) {
        CloudDatabaseManager dbManager = new CloudDatabaseManager();
        Firebase notes = dbManager.getNoteEntity();
        notes.setValue(data);
    }

    public void addGroup(Map<String, Object> data) {
        CloudDatabaseManager dbManager = new CloudDatabaseManager();
        Firebase groups = dbManager.getGroupEntity();
        groups.setValue(data);
    }

    public List<String> getAnnotationFields(Class model) {
        List<String> annotationFields = new ArrayList<>();
        for (Field field : model.getDeclaredFields()) {
            SerializeName serName = field.getAnnotation(SerializeName.class);
            if (serName != null) {
                annotationFields.add(serName.fieldName());
            }
        }
        return annotationFields;
    }

    private class NotesValuesEventListener implements ValueEventListener {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            List<Note> data = new ArrayList<>();
            for (DataSnapshot itemSnapshot : dataSnapshot.getChildren()) {
                if (itemSnapshot != null) {
                    Map mapData = (HashMap) itemSnapshot.getValue();
                    Note note = new Note();
                    Field[] fields = Note.class.getDeclaredFields();
                    for (Field item : fields) {
                        SerializeName serName = item.getAnnotation(SerializeName.class);
                        if (serName != null) {
                            try {
                                item.setAccessible(true);
                                item.set(note, mapData.get(serName.fieldName()));
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    data.add(note);
                }
            }
        }

        @Override
        public void onCancelled(FirebaseError firebaseError) {
        }
    }
}