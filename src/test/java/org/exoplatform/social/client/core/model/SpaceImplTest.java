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
package org.exoplatform.social.client.core.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.exoplatform.social.client.api.model.RestSpace;
import org.testng.annotations.Test;

/**
 * Created by The eXo Platform SAS Author : Philippe Aristote
 * paristote@exoplatform.com May 4, 2015
 */
public class SpaceImplTest {

  @Test
  public void shouldCreateInstanceAndGetFields() {
    RestSpace space = new RestSpace();
    space.setAvatarUrl("http://example.org/image/avatar.jpg");
    space.setName("exospace");
    space.setDisplayName("eXo Space");

    assertThat("Avatar URL should be http://example.org/image/avatar.jpg",
               space.getAvatarUrl(),
               equalTo("http://example.org/image/avatar.jpg"));
    assertThat("Name should be exospace", space.getName(), equalTo("exospace"));
    assertThat("Display Name should be eXo Space", space.getDisplayName(), equalTo("eXo Space"));
  }

}
