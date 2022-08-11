import scala.util.Random

object GamePlayer extends App {

  val firstPlayer = new Player("Vusi")
  val secondPlayer = new Player("Dalisani")
  val random = Random// random generate score

  var setWinnerStatus = false

  val setGames = new SetGames()

  val matchGames = new Match()

  while(setWinnerStatus == false) {

    firstPlayer.score = random.nextInt(100)
    secondPlayer.score = random.nextInt(100)

    if(firstPlayer.score > secondPlayer.score) {
      firstPlayer.gamesWon +=1
      setWinnerStatus = setGames.setWon(firstPlayer.gamesWon, secondPlayer.gamesWon)
      println(s" ${firstPlayer.name } won a game score ${firstPlayer.score} - ${secondPlayer.score}")
      if(setWinnerStatus){
        println(s" ${firstPlayer.name } Won a SET games won score ${firstPlayer.gamesWon} - ${secondPlayer.gamesWon} " +
          s" with games won greater then ${setGames.maximumGamesWon} and game margin greater then ${setGames.minimumGamesWonMargin}")
      }
    } else{
      secondPlayer.gamesWon +=1
      setWinnerStatus = setGames.setWon(secondPlayer.gamesWon, firstPlayer.gamesWon)
      println(s" ${secondPlayer.name } won a game score ${secondPlayer.score} - ${firstPlayer.score}")

      if(setWinnerStatus){
        println(s" ${secondPlayer.name } won SET games won score ${secondPlayer.gamesWon} - ${firstPlayer.gamesWon} " +
          s" with games won greater then ${setGames.maximumGamesWon} and game margin greater then ${setGames.minimumGamesWonMargin}")
      }
    }


  }



}
