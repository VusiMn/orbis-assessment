import scala.util.Random

object GamePlayer extends App {

  val firstPlayer = new Player("FirstPlayer")
  val secondPlayer = new Player("SecondPlayer")
  val random = Random// random generate score

  var setWinnerStatus = false
  var numberSetsWon = 0

  val setGames = new SetGames()

  val matchGames = new Match()


  var matchWinnerCount = 0

  while(matchWinnerCount < matchGames.maximumSetsWonMargin) {
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

  }
  /***
  while(setWinnerStatus == false) {

    firstPlayer.score = random.nextInt(100)
    secondPlayer.score = random.nextInt(100)

    if(firstPlayer.score > secondPlayer.score) {
      firstPlayer.gamesWon +=1
      setWinnerStatus = setGames.setWon(firstPlayer.gamesWon, secondPlayer.gamesWon)
      println(s" ${firstPlayer.name } won a game score ${firstPlayer.score} - ${secondPlayer.score}")
      if(setWinnerStatus){
        numberSetsWon += 1
        firstPlayer.setsWon += 1
        println(s" ${firstPlayer.name } Won a SET games won score ${firstPlayer.gamesWon} - ${secondPlayer.gamesWon} " +
          s" with games won greater then ${setGames.maximumGamesWon} and game margin greater then ${setGames.minimumGamesWonMargin}")
      }
    } else{
      secondPlayer.gamesWon +=1
      setWinnerStatus = setGames.setWon(secondPlayer.gamesWon, firstPlayer.gamesWon)
      println(s" ${secondPlayer.name } won a game score ${secondPlayer.score} - ${firstPlayer.score}")

      if(setWinnerStatus){
        numberSetsWon += 0
        secondPlayer.setsWon += 1
        println(s" ${secondPlayer.name } won SET games won score ${secondPlayer.gamesWon} - ${firstPlayer.gamesWon} " +
          s" with games won greater then ${setGames.maximumGamesWon} and game margin greater then ${setGames.minimumGamesWonMargin}")
      }
    }***/







}
