package com.sprilutsky.firebasesample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.sprilutsky.firebasesample.R;
import com.sprilutsky.firebasesample.data.managers.DataManager;
import com.sprilutsky.firebasesample.data.models.Group;
import com.sprilutsky.firebasesample.data.models.Note;
import com.sprilutsky.firebasesample.data.models.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataManager manager = new DataManager();
        Map<String, Object> data = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Note note = new Note();
            note.setContent("New content " + Integer.toString(i));
            note.setGroupId(i);
            note.setNoteId(i + 2);
            note.setUserId(i + 3);
            note.setNoteOrder(i + 4);
            note.setNoteName("No Name Note " + Integer.toString(i));
            data.put(note.getNoteName(), note.convertToMap());
        }
        manager.addNote(data);
        manager.getNotes();
    }
}
