package ch.epfl.bigdata.btc.crawler.btc

import ch.epfl.bigdata.btc.crawler.coins.markets.MarketFetchPool
import ch.epfl.bigdata.btc.crawler.coins.types._
import ch.epfl.bigdata.btc.crawler.coins.DataSource
import akka.actor.{ActorSystem, Props}


object FetchRunner extends App {
	val system = ActorSystem("DataSourceSystem")
	
	
	println(system.name)
	
	ActorPool.dataSource ! new MarketPairRegistration(
	    Market.BTCe, CurrencyPair(Currency.USD, Currency.BTC))
	
	println("FetchRunner | dataSource")
	
	ActorPool.dataSource ! new MarketPairRegistration(
	    Market.BTCe, CurrencyPair(Currency.BTC, Currency.USD))
	
	println("FetchRunner | dataSource")
	
}

object ActorPool {
  val dataSource = FetchRunner.system.actorOf(Props[DataSource], "DataSource")
  }

