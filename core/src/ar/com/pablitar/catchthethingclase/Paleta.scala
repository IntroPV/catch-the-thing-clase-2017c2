package ar.com.pablitar.catchthethingclase

import com.badlogic.gdx.math.Vector2
import ar.com.pablitar.libgdx.commons.traits.RectangularPositioned
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input.Keys

class Paleta extends RectangularPositioned {
  position = new Vector2(Configuration.DISPLAY_WIDTH / 2, 100)
  
  override val width = 200f
  override val height = 80f
  
  val velocity: Vector2 = new Vector2(300,0)
  
  val speed = 600

  def update(delta: Float) = {
    velocity.x = 0
    if(Gdx.input.isKeyPressed(Keys.LEFT)) {
       velocity.x -= speed
    } 
    
    if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
       velocity.x += speed
    }
    
    position.add(velocity.cpy().scl(delta))
  }
}





