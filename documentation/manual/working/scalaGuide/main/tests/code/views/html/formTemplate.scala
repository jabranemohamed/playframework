/*
 * Copyright (C) 2009-2017 Lightbend Inc. <https://www.lightbend.com>
 */
package views.html

import play.api.data.Form
import play.api.i18n.MessagesProvider
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import ExecutionContext.Implicits.global

object formTemplate extends Results {

  def apply[T](form: Form[T])(implicit provider: MessagesProvider) : Future[Result] = {
    Future(
      Ok("ok") as("text/html")
    )
  }
}