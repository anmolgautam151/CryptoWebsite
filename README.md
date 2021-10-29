# CryptoWebsite
Compares the values of Bitcoin and Ethereum from different exchanges and recommend 

To run the file download the SpringBoot_backend and run the demo app from the IDE. It will run on the its default port 8080.
To run the front end download the ReactJS_frontend. Inside the folder, run npm build and then npm start which will run the front end application on default port 3000.

Are there any sub-optimal choices( or short cuts taken due to limited time ) in your implementation?
  -- The recommendation system does not take into account previous data to recommend the exchange. 
Is any part of it over-designed? ( It is fine to over-design to showcase your skills as long as you are clear about it)
  -- I would not consider anything over-designed in the application.
If you have to scale your solution to 100 users/second traffic what changes would you make, if any?
  -- To do this, there is a need to implement asynchronous get request handling. It is currently synchronous which would increase the latency too much.
What are some other enhancements you would have made, if you had more time to do this implementation
  -- Having more time, I would have implemented a much better recommendation system which would take into account previous record from the exchanges 
  and build a small machine learning model to do the same.
 
