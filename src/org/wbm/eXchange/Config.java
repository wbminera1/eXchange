package org.wbm.eXchange;

import com.google.gson.Gson;

import java.io.*;

/**
 * Created by wbminera1 on 05.01.2016.
 */
public class Config {

    public static class Data
    {
        String StorePath = new String();
        String Exchanges[] = new String[128];
    }

    Data mData = new Data();

    private String GetFileName() {
        return System.getProperty("user.home") + File.separator + "bconfig.json";
    }

    public boolean Save()
    {
        Gson gson = new Gson();
        return WriteToFile(GetFileName(),gson.toJson(mData));
    }

    public boolean Load()
    {
        String data = ReadFromFile(GetFileName());
        Gson gson = new Gson();
        mData = new Data();
        mData = gson.fromJson(data, mData.getClass());
        return true;
    }

    private boolean WriteToFile(String fileName, String data)
    {
        BufferedWriter writer = null;
        try {
            File file = new File(fileName);

            System.out.println(file.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(file));
            writer.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
        return false;
    }

    private String ReadFromFile(String fileName)
    {
        BufferedReader reader = null;
        File file = new File(fileName);
        String result = new String();
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                result += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Config self = new Config();
        self.mData.StorePath = "D:\\Data";
        //self.mData.Exchanges[ 0] = "org.knowm.xchange.btce.v3.BTCEExchange";
        self.mData.Exchanges[ 1] = "org.knowm.xchange.bitbay.BitbayExchange";
        self.mData.Exchanges[ 2] = "org.knowm.xchange.bitcoinaverage.BitcoinAverageExchange";
        self.mData.Exchanges[ 3] = "org.knowm.xchange.bitcoincharts.BitcoinChartsExchange";
        self.mData.Exchanges[ 4] = "org.knowm.xchange.bitcoinde.BitcoindeExchange";
        self.mData.Exchanges[ 5] = "org.knowm.xchange.bitcoinium.BitcoiniumExchange";
        self.mData.Exchanges[ 6] = "org.knowm.xchange.bitcurex.BitcurexExchange";
        self.mData.Exchanges[ 7] = "org.knowm.xchange.bitfinex.v1.BitfinexExchange";
        self.mData.Exchanges[ 8] = "org.knowm.xchange.bitkonan.BitKonanExchange";
        self.mData.Exchanges[ 9] = "org.knowm.xchange.bitmarket.BitMarketExchange";
        self.mData.Exchanges[10] = "org.knowm.xchange.bitso.BitsoExchange";
        self.mData.Exchanges[11] = "org.knowm.xchange.bitstamp.BitstampExchange";
        self.mData.Exchanges[12] = "org.knowm.xchange.bittrex.v1.BittrexExchange";
        self.mData.Exchanges[13] = "org.knowm.xchange.bleutrade.BleutradeExchange";
        self.mData.Exchanges[14] = "org.knowm.xchange.blockchain.BlockchainExchange";
        self.mData.Exchanges[15] = "org.knowm.xchange.btccentral.BTCCentralExchange";
        self.mData.Exchanges[16] = "org.knowm.xchange.btcchina.BTCChinaExchange";
        self.mData.Exchanges[17] = "org.knowm.xchange.btce.v3.BTCEExchange";
        self.mData.Exchanges[18] = "org.knowm.xchange.btcmarkets.BTCMarketsExchange";
        self.mData.Exchanges[19] = "org.knowm.xchange.btctrade.BTCTradeExchange";
        self.mData.Exchanges[20] = "org.knowm.xchange.bter.BTERExchange";
        self.mData.Exchanges[21] = "org.knowm.xchange.campbx.CampBXExchange";
        self.mData.Exchanges[22] = "org.knowm.xchange.cexio.CexIOExchange";
        self.mData.Exchanges[23] = "org.knowm.xchange.clevercoin.CleverCoinExchange";
        self.mData.Exchanges[24] = "org.knowm.xchange.coinbase.CoinbaseExchange";
        self.mData.Exchanges[25] = "org.knowm.xchange.coinbaseex.CoinbaseExExchange";
        self.mData.Exchanges[26] = "org.knowm.xchange.coinfloor.CoinfloorExchange";
        self.mData.Exchanges[27] = "org.knowm.xchange.coinmate.CoinmateExchange";
        self.mData.Exchanges[28] = "org.knowm.xchange.coinsetter.CoinsetterExchange";
        self.mData.Exchanges[29] = "org.knowm.xchange.cointrader.CointraderExchange";
        self.mData.Exchanges[30] = "org.knowm.xchange.cryptofacilities.CryptoFacilitiesExchange";
        self.mData.Exchanges[31] = "org.knowm.xchange.cryptonit.v2.CryptonitExchange";
        self.mData.Exchanges[32] = "org.knowm.xchange.cryptsy.CryptsyExchange";
        self.mData.Exchanges[33] = "org.knowm.xchange.empoex.EmpoExExchange";
        self.mData.Exchanges[34] = "org.knowm.xchange.gatecoin.GatecoinExchange";
        self.mData.Exchanges[35] = "org.knowm.xchange.hitbtc.HitbtcExchange";
        self.mData.Exchanges[36] = "org.knowm.xchange.huobi.HuobiExchange";
        self.mData.Exchanges[37] = "org.knowm.xchange.independentreserve.IndependentReserveExchange";
        self.mData.Exchanges[38] = "org.knowm.xchange.itbit.v1.ItBitExchange";
        self.mData.Exchanges[39] = "org.knowm.xchange.kraken.KrakenExchange";
        self.mData.Exchanges[40] = "org.knowm.xchange.lakebtc.LakeBTCExchange";
        self.mData.Exchanges[41] = "org.knowm.xchange.loyalbit.LoyalbitExchange";
        self.mData.Exchanges[42] = "org.knowm.xchange.mercadobitcoin.MercadoBitcoinExchange";
        self.mData.Exchanges[43] = "org.knowm.xchange.mexbt.MeXBTExchange";
        self.mData.Exchanges[44] = "org.knowm.xchange.oer.OERExchange";
        self.mData.Exchanges[45] = "org.knowm.xchange.poloniex.PoloniexExchange";
        self.mData.Exchanges[46] = "org.knowm.xchange.quoine.QuoineExchange";
        self.mData.Exchanges[47] = "org.knowm.xchange.ripple.RippleExchange";
        self.mData.Exchanges[48] = "org.knowm.xchange.taurus.TaurusExchange";
        self.mData.Exchanges[49] = "org.knowm.xchange.therock.TheRockExchange";
        self.mData.Exchanges[50] = "org.knowm.xchange.vircurex.VircurexExchange";
        self.mData.Exchanges[51] = "org.knowm.xchange.virtex.v2.VirtExExchange";
        
        //.OkCoinExchangeStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
        //.HitbtcStreamingMarketDataConfiguration| |implements| |eXchange|StreamingConfiguration| |{|
//.BitstampStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
//.BTCChinaStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
//.CoinfloorExchangeEvent| |implements| |eXchange|Event| |{
//.CoinfloorStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
//.MeXBTExchangeStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
//.AtlasStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
//.CoinsetterStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{
//.OkCoinExchangeEvent| |implements| |eXchange|Event| |{
//.DefaultExchangeEvent| |implements| |eXchange|Event| |{
//.HuobiExchangeStreamingConfiguration| |implements| |eXchange|StreamingConfiguration| |{

        self.Save();
        self.Load();
        self.Save();

        //.return false;
    }
}
