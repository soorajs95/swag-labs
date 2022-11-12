test:
	mvn clean test -Dheadless=true

test-smoke:
	mvn clean test -Dheadless=true -Dcucumber.filter.tags=@Smoke

test-headed:
	mvn clean test -Dheadless=false

generate-report:
	mvn cluecumber-report:reporting