confluence5-slow-it
===================

plugin that demonstrates the space create and destroy performance issue in confluence 5

Test Confluence 4.3.x
=====================

$atlas-mvn clean integration-test -Dproduct.version=4.3.3

Test Confluence 5.0-rc1
========================

$atlas-mvn clean integration-test -Dproduct.version=5.0-rc1

Changing Test Behavior
========================

In it.slow.ITPerformanceTests change 
    private final int NUM_PAGES = 0; 
to the number of pages that should be created per space.


Test Results
================

You can start the Confluence version with
$ atlas-run -Dproduct.version=x.x.x

Run the IT from your IDE and export the test result to HTML or other.

