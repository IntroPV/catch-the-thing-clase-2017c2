package ar.com.pablitar.catchthethingclase

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import ar.com.pablitar.libgdx.commons.rendering.Renderers
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType

class CatchTheThingGame extends ApplicationAdapter {
  
  val paleta = new Paleta
  lazy val renderers = new Renderers
  
  override def render() {
    update(Gdx.graphics.getDeltaTime)
    renderWorld()
  }
  
  override def dispose() {
    renderers.dispose()
  }

  def update(delta: Float) = {
    paleta.update(delta)
  }

  def renderWorld() = {
    renderers.withRenderCycle((0.1f,0.1f,0.1f)) {
      renderers.withShapes(ShapeType.Filled) { shapeRenderer =>
        shapeRenderer.rect(paleta.topLeft.x, paleta.topLeft.y, 
            paleta.width, paleta.height)
      }
    }
  }
  
  
  
  
  
  

}