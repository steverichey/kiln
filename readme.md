# kiln

Kiln is a highly opinionated 2D game engine. Some of these opinions are good. The main goal of this is rapid prototyping of game ideas with minimal friction, without reliance on closed-source solutions (e.g. Unity3D) while also enabling the build and distribution of games without reliance on antiquated technology (e.g. Stencyl's reliance on Flash).

## Goals

### Short-term
* OpenGL rendering
* Windows, Linux, and Mac support (via JVM)
* Minimal or no global state
* Understandable syntax
* Use functional programming where appropriate
* Design with testability in mind

### Long-term
* Native targets
* 3D support
* iOS and Android support

### Non-goals
* Efficiency at the cost of ease of use
* Strict adherence to functional programming paradigms
* 100% code coverage

## Why Kotlin?
* Static typing
* Simple syntax
* Lambdas and other functional programming niceties
* Implicit null checking by default
* Runs on the JVM, which runs everywhere
* Evolving support for native and JavaScript targets
* No semicolons

## Target syntax

This is an evolving target, but the hope is that something like the below would work.

```
class Game: KilnGame {
  val sprite = KilnSprite(16, 16)

  fun update() {
    sprite.position.x += 1
    sprite.position.y += 1

    if (sprite.position.x > screen.bounds.x) {
      sprite.position.x = 0
    }

    if (sprite.position.y > screen.bounds.y) {
      sprite.position.y = 0
    }
  }
}

fun main() {
  val game = Game(640, 480)
  game.start()
}
```

## License

&copy; 2017 [Steve Richey](https://github.com/steverichey). Shared under an [MIT license](https://en.wikipedia.org/wiki/MIT_License). See [license.md](./license.md) for details.
