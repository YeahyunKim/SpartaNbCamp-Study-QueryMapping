/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.thesun4sky.querymapper.domain;

import java.io.Serializable;


// Serializable 상속받아야 객체를 만들어서 값을 집어 넣어줄 수 있다.
// Serializable 한 객체, 직렬화가 가능한 객체를 생성
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String name;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return getId() + "," + getName();
  }

}
