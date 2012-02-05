package name.guxg.liftmodule
package TwitterBootstrap 
  
object TwitterBootstrap {
  def init() {
    net.liftweb.http.ResourceServer.allow {
      case  "bootstrap" :: _ :: Nil => true
      case  "bootstrap" :: _ :: _ :: Nil => true
      case  "bootstrap" :: _ :: _ :: _ :: Nil => true
    } 
    
  }
}

