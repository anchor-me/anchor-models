package com.anchor.model

import java.sql.Time

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class ConcreteBlock (id: Id,
                          start: Long,
                          finish: Long,
                          task: Option[Id]) extends ScheduledItem
