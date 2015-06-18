/*
 * Copyright (C) 2003-2015 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.social.client.api.model;

/**
 * Created by The eXo Platform SAS
 * 
 * @author Philippe Aristote paristote@exoplatform.com
 * @since Apr 21, 2015
 */
public class RestSpace extends Model {

  public static enum Field {

    DISPLAY_NAME("displayName"),

    AVATAR_URL("avatarUrl"),

    NAME("name"),

    GROUP_ID("groupId");

    private final String jsonString;

    private Field(String jsonString) {
      this.jsonString = jsonString;
    }

    @Override
    public String toString() {
      return jsonString;
    }
  }

  public RestSpace() {
  }

  public void setDisplayName(String displayName) {
    setField(Field.DISPLAY_NAME.toString(), displayName);
  }

  public String getDisplayName() {
    return getFieldAsString(Field.DISPLAY_NAME.toString());
  }

  public void setAvatarUrl(String url) {
    setField(Field.AVATAR_URL.toString(), url);
  }

  public String getAvatarUrl() {
    return getFieldAsString(Field.AVATAR_URL.toString());
  }

  public void setName(String name) {
    setField(Field.NAME.toString(), name);
  }

  public String getName() {
    return getFieldAsString(Field.NAME.toString());
  }

  public void setGroupId(String id) {
    setField(Field.GROUP_ID.toString(), id);
  }

  public String getGroupId() {
    return getFieldAsString(Field.GROUP_ID.toString());
  }

}
