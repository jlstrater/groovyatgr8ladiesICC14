import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    get {
      render groovyTemplate("index.html", title: "Presentation Title")
    }

    post("eval") {
      return evaluate(request.body)
    }
    assets "public"
  }
}
