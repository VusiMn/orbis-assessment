

object GamePlayer extends App {

  val firstPlayer = new Player("FirstPlayer")
  val secondPlayer = new Player("SecondPlayer")

  val setGames = new SetGames()

  val matchGames = new Match()


  var matchWinnerCount = 0

  while(matchWinnerCount == 0) {
    setGames.playSetGames(firstPlayer, secondPlayer)


    //println(s"Games Won ${result._1.gamesWon} , set won ${result._1.setsWon} ")
    //  println(s"Games Won ${result._2.gamesWon} , set won ${result._2.setsWon} ")

    println(s"${firstPlayer.name} Games Won ${firstPlayer.gamesWon} , set won ${firstPlayer.setsWon} ")
    println(s"${secondPlayer.name} Games Won ${secondPlayer.gamesWon} , set won ${secondPlayer.setsWon} ")

    if (matchGames.matchWon(firstPlayer.setsWon)) {
      matchWinnerCount += 1
      println(s"${firstPlayer.name} MATCH WINNER Games Won ${firstPlayer.gamesWon} , set won ${firstPlayer.setsWon} ")
    }

    if (matchGames.matchWon(secondPlayer.setsWon)) {
      matchWinnerCount += 1
      println(s"${secondPlayer.name} MATCH WINNER Games Won ${secondPlayer.gamesWon} , set won ${secondPlayer.setsWon} ")
    }

    firstPlayer.resetGamesWon()
    secondPlayer.resetGamesWon()
  }
}
