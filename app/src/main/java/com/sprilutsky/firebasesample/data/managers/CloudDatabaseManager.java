package com.sprilutsky.firebasesample.data.managers;

import com.firebase.client.Firebase;
import com.sprilutsky.firebasesample.data.constants.DBCloudConstants;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
public class CloudDatabaseManager {

    private Firebase rootRef;

    public CloudDatabaseManager() {
        this.rootRef = new Firebase(DBCloudConstants.DATABASE_URL);
    }

    public Firebase getUserEntity() {
        return rootRef.child(DBCloudConstants.DB_USER_ENTITY);
    }

    public Firebase getGroupEntity() {
        return rootRef.child(DBCloudConstants.DB_GROUP_ENTITY);
    }

    public Firebase getNoteEntity() {
        return rootRef.child(DBCloudConstants.DB_NOTES_ENTITY);
    }
}
