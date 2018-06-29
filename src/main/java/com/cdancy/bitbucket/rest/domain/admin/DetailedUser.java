package com.cdancy.bitbucket.rest.domain.admin;

import com.cdancy.bitbucket.rest.BitbucketUtils;
import com.cdancy.bitbucket.rest.domain.common.Error;
import com.cdancy.bitbucket.rest.domain.common.ErrorsHolder;
import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

import java.util.List;

@AutoValue
public abstract class DetailedUser implements ErrorsHolder {

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String emailAddress();

    @Nullable
    public abstract Integer id();

    @Nullable
    public abstract String displayName();

    @Nullable
    public abstract Boolean active();

    @Nullable
    public abstract String slug();

    @Nullable
    public abstract String type();

    @Nullable
    public abstract String directoryName();

    @Nullable
    public abstract Boolean deletable();

    @Nullable
    public abstract Long lastAuthenticationTimestamp();

    @Nullable
    public abstract Boolean mutableDetails();

    @Nullable
    public abstract Boolean mutableGroups();

    DetailedUser() {
    }

    @SerializedNames({ "name", "emailAddress", "id", "displayName", "active", "slug", "type", "directoryName",
        "deletable", "lastAuthenticationTimestamp", "mutableDetails", "mutableGroups", "errors" })
    public static DetailedUser create(final String name, final String emailAddress, final int id,
                                      final String displayName, final boolean active, final String slug,
                                      final String type, final String directoryName, final boolean deletable,
                                      long lastAuthenticationTimestamp, boolean mutableDetails,
                                      final boolean mutableGroups, final List<Error> errors) {

        return new AutoValue_DetailedUser(BitbucketUtils.nullToEmpty(errors), name, emailAddress, id, displayName,
            active, slug, type, directoryName, deletable, lastAuthenticationTimestamp, mutableDetails, mutableGroups);
    }
}
