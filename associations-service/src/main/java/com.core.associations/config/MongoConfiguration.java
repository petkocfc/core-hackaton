package com.core.associations.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.IMongodConfig;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class MongoConfiguration {

  private String MONGO_DB_URL = "mongodb://localhost:27017";
  private String MONGO_DB_HOST = "localhost";
  private int MONGO_DB_PORT = 27017;
  private String MONGO_DB_NAME = "associations";

  @Bean
  public MongoTemplate mongoTemplate() throws IOException {
    IMongodConfig mongodConfig = new MongodConfigBuilder().version(Version.Main.PRODUCTION)
        .net(new Net(MONGO_DB_HOST, MONGO_DB_PORT, Network.localhostIsIPv6()))
        .build();
    MongodStarter starter = MongodStarter.getDefaultInstance();
    MongodExecutable mongodExecutable = starter.prepare(mongodConfig);
    mongodExecutable.start();
    MongoTemplate mongoTemplate = new MongoTemplate(MongoClients.create(MONGO_DB_URL), "test");
    return mongoTemplate;
  }

}
