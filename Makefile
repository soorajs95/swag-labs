desktop:
	mvn clean test -Dheadless=true

mobile:
	mvn clean test -Dheadless=true -Dbrowser_width=375 -Dbrowser_height=842

edge:
	mvn clean test -Dheadless=true -Dbrowser=edge

firefox:
	mvn clean test -Dheadless=true -Dbrowser=firefox

smoke:
	mvn clean test -Dheadless=true -Dcucumber.filter.tags=@Smoke

generate-report:
	mvn cluecumber-report:reporting