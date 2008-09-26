/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.gen2.datepicker.client;

import java.util.Date;

/**
 * Abstract month selector widget.
 * 
 */
public abstract class MonthSelector extends DatePickerComponent {

  /**
   * Sets the date range that this month selector is allowed to chose from.
   */
  public abstract void setAllowableDateRange(Date from, Date to);

}