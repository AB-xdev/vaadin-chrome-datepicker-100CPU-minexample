
## How to reproduce the bug
* Checkout this repo
* Deploy the code onto an application server (I prefer Wildfly)
* Deploying via Eclipse and Wildfly works like this:
  * Import the project into Eclipse
  * Build the code with maven: ``clean compile vaadin:prepare-frontend``
  * Refresh the project
  * Deploy it onto your wildfly
* Open http://localhost:8080/minimalexample-1.0-SNAPSHOT/ in Chrome
* Select a date in a datepicker (for best reproducibility use the PREIS_AB and PREIS_BIS datepickers)
* → The tab hangs and runs at 100% CPU
* If not: Repeat selecting dates a few times until the problem occurs
