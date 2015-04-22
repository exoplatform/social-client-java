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
package org.exoplatform.social.client.core.service;

import static org.exoplatform.social.client.api.util.SocialHttpClientSupport.handleError;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.exoplatform.social.client.api.SocialClientLibException;
import org.exoplatform.social.client.api.model.RestSpace;
import org.exoplatform.social.client.api.net.SocialHttpClient.POLICY;
import org.exoplatform.social.client.api.service.ServiceException;
import org.exoplatform.social.client.api.service.SpaceService;
import org.exoplatform.social.client.api.util.SocialHttpClientSupport;
import org.exoplatform.social.client.api.util.SocialJSONDecodingSupport;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

/**
 * Created by The eXo Platform SAS Author : Philippe Aristote
 * paristote@exoplatform.com Apr 21, 2015
 */
public class SpaceServiceImplV1Alpha3 implements SpaceService<RestSpace> {

    private static final String MY_SPACES_URL = "/rest/private/portal/social/spaces/mySpaces/show.json";

    @Override
    public List<RestSpace> getMySocialSpaces() {
        try {
            HttpResponse response = SocialHttpClientSupport.executeGet(MY_SPACES_URL,
                                                                       POLICY.BASIC_AUTH);
            handleError(response);
            return getListOfSpacesFromResponse(response);
        } catch (IOException ioex) {
            throw new ServiceException(SpaceServiceImplV1Alpha3.class,
                                       "IOException when reading Json Content.",
                                       ioex);
        } catch (ParseException pex) {
            throw new ServiceException(SpaceServiceImplV1Alpha3.class,
                                       "ParseException when reading Json Content.",
                                       pex);
        } catch (SocialClientLibException e) {

        }
        return null;
    }

    private List<RestSpace> getListOfSpacesFromResponse(HttpResponse response) throws ParseException {
        try {
            JSONObject root = (JSONObject) JSONValue.parse(SocialHttpClientSupport.getContent(response));
            JSONArray spaces = (JSONArray) root.get("spaces");
            List<RestSpace> listSpaces = SocialJSONDecodingSupport.JSONArrayObjectParser(RestSpace.class,
                                                                                         spaces.toJSONString());
            return listSpaces;
        } catch (Exception e) {
            throw new ServiceException(SpaceServiceImplV1Alpha3.class,
                                       "Cannot parse the Json Content",
                                       e);
        }
    }

    /*
     * UNSUPPORTED
     */

    @Override
    public RestSpace create(RestSpace newInstance) throws SocialClientLibException {
        throw new SocialClientLibException("Not Supported");
    }

    @Override
    public RestSpace get(String uuid) throws SocialClientLibException {
        throw new SocialClientLibException("Not Supported");
    }

    @Override
    public RestSpace update(RestSpace existingInstance) throws SocialClientLibException {
        throw new SocialClientLibException("Not Supported");
    }

    @Override
    public RestSpace delete(RestSpace existingInstance) throws SocialClientLibException {
        throw new SocialClientLibException("Not Supported");
    }

}
