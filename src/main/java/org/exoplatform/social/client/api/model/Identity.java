/*
 * Copyright (C) 2003-2011 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.social.client.api.model;

/**
 * eXo Social Identity.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since May 19, 2011
 */
public interface Identity extends Model {

  /**
   * Gets identity provider id.
   *
   * @return
   */
  String getProviderId();

  /**
   * Sets identity provider id.
   *
   * @param providerId
   */
  void setProviderId(String providerId);

  /**
   * Gets the remote identity id.
   * @return
   */
  String getRemoteId();

  /**
   * Sets the remote identity id.
   */
  void setRemoteId(String identityId);

  /**
   * Gets the profile associated with this identity.
   * @return the associated profile.
   */
  Profile getProfile();
}