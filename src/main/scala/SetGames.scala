import scala.math.random
import scala.util.Random

class SetGames {

  // sets care about games won
  val minimumGamesWonMargin = 2
  val maximumGamesWon = 6

  val random = Random // random generate score

  def setWon(playOneGamesWon: Int, playTwoGamesWon: Int): Boolean = {
    playOneGamesWon >= maximumGamesWon && (playOneGamesWon - playTwoGamesWon) > minimumGamesWonMargin
  }


  def playSetGames(firstPlayer: Player, secondPlayer: Player): Unit = {

    var setWinnerStatus = false

    while (setWinnerStatus == false) {

      firstPlayer.score = random.nextInt(100)
      secondPlayer.score = random.nextInt(100)

      if (firstPlayer.score > secondPlayer.score) {
        firstPlayer.gamesWon += 1
        setWinnerStatus = setWon(firstPlayer.gamesWon, secondPlayer.gamesWon)
        println(s" ${firstPlayer.name} won a game score ${firstPlayer.score} - ${secondPlayer.score}")
        if (setWinnerStatus) {

          firstPlayer.setsWon += 1
          println(s" ${firstPlayer.name} Won a SET games won score ${firstPlayer.gamesWon} - ${secondPlayer.gamesWon} " +
            s" with games won greater then ${maximumGamesWon} and game margin greater then ${minimumGamesWonMargin}")
        }
      } else {
        secondPlayer.gamesWon += 1
        setWinnerStatus = setWon(secondPlayer.gamesWon, firstPlayer.gamesWon)
        println(s" ${secondPlayer.name} won a game score ${secondPlayer.score} - ${firstPlayer.score}")

        if (setWinnerStatus) {

          secondPlayer.setsWon += 1
          println(s" ${secondPlayer.name} won SET games won score ${secondPlayer.gamesWon} - ${firstPlayer.gamesWon} " +
            s" with games won greater then ${maximumGamesWon} and game margin greater then ${minimumGamesWonMargin}")
        }
      }

    }

  }
}
