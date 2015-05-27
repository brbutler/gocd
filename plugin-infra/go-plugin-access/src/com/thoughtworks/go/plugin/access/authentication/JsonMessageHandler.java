/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.plugin.access.authentication;

import com.thoughtworks.go.plugin.access.authentication.model.AuthenticationPluginConfiguration;
import com.thoughtworks.go.plugin.access.authentication.model.User;

import java.util.List;

public interface JsonMessageHandler {
    AuthenticationPluginConfiguration responseMessageForPluginConfiguration(String responseBody);

    String requestMessageForAuthenticateUser(String username, String password);

    User responseMessageForAuthenticateUser(String responseBody);

    String requestMessageForSearchUser(String searchTerm);

    List<User> responseMessageForSearchUser(String responseBody);
}