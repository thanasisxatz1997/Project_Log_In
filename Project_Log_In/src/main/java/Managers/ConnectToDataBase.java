package Managers;

import Managers.DataManager;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.types.ObjectId;
//import java.util.logging.Logger;


public class ConnectToDataBase {
    public static ConnectionString connectionString;
    public ConnectToDataBase()
    {
        System.out.println("DONE");
        connectionString = new ConnectionString("mongodb+srv://root:root@loginformdb.sbptfd0.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient client = MongoClients.create(settings);
        MongoDatabase db = client.getDatabase("Project_Log_In");
        MongoCollection coll= db.getCollection("User");
        DataManager.DbCollection= coll;
        if(coll!=null)
        {
            System.out.println("CONNECTED TO DATABASE");
        }
    }
    public static ConnectionString GetConnection()
    {
        return connectionString;
    }
    /*public static void main(String[] args) {


        // CODE TO INSERT DATA TO MONGODB
        /*for(int i=0; i<10;i++)
        {
            Document sampleDoc= new Document("_id",new ObjectId()).append("num",i);
            coll.insertOne(sampleDoc);
        }
        // CODE TO DELETE DATA FROM MONGODB
        for(int i=0; i<10;i++)
        {
            //CODE TO FIND IF DATA EXISTS IN MONGODB
            FindIterable<Document>iterable=coll.find(new Document("num", i));
            if(iterable.first()!=null)
            {
                coll.deleteOne(Filters.eq("num",i));
                System.out.println("Deleted");
            }
            else
            {
                System.out.println("Does not exist");
            }

        }
        System.out.println("DONE2");
    }*/
}
