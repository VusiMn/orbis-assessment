import scala.util.Random

object GamePlayer extends App {

  val firstPlayer = new Player("Vusi")
  val secondPlayer = new Player("Dalisani")
  val random = Random// random generate score

  var setWinner = false

  val setGames = new SetGames()

  while(setGames.setWon(firstPlayer.gamesWon, secondPlayer.gamesWon) || setGames.setWon(secondPlayer.gamesWon, firstPlayer.gamesWon)) {

    firstPlayer.score = random.nextInt(100)
    secondPlayer.score = random.nextInt(100)

    if(firstPlayer.score > secondPlayer.score) {
      firstPlayer.gamesWon +=1
      println(s" ${firstPlayer.name } won a game score ${firstPlayer.score} - ${secondPlayer.score}")
    } else{
      secondPlayer.gamesWon +=1
      println(s" ${secondPlayer.name } won a game score ${secondPlayer.score} - ${firstPlayer.score}")
    }


  }



}
