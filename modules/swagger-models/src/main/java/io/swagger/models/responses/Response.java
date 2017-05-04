/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.models.responses;

import java.util.Objects;
import io.swagger.models.headers.Headers;
import io.swagger.models.links.Link;
import io.swagger.models.media.Content;

/**
 * Response
 *
 * @link https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc0/versions/3.0.md#responseObject
 */


public class Response {
  private String description = null;
  private Headers headers = null;
  private Content content = null;
  private Link links = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the description property from a Response instance.
   *
   * @return String description
   **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Response description(String description) {
    this.description = description;
    return this;
  }

  /**
   * returns the headers property from a Response instance.
   *
   * @return Headers headers
   **/

  public Headers getHeaders() {
    return headers;
  }

  public void setHeaders(Headers headers) {
    this.headers = headers;
  }

  public Response headers(Headers headers) {
    this.headers = headers;
    return this;
  }

  /**
   * returns the content property from a Response instance.
   *
   * @return Content content
   **/

  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  public Response content(Content content) {
    this.content = content;
    return this;
  }

  /**
   * returns the links property from a Response instance.
   *
   * @return Link links
   **/

  public Link getLinks() {
    return links;
  }

  public void setLinks(Link links) {
    this.links = links;
  }

  public Response links(Link links) {
    this.links = links;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.description, response.description) &&
        Objects.equals(this.headers, response.headers) &&
        Objects.equals(this.content, response.content) &&
        Objects.equals(this.links, response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, headers, content, links);
  }


  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

