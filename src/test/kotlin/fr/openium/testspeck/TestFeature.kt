package fr.openium.testspeck

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import kotlin.test.assertTrue

object TestFeature : Spek({
    Feature("testFeature") {
        Scenario("scenario test") {
            When("when test") {

            }
            Then("then test") {
                assertTrue { true }
            }
        }

        Scenario("scenario test 2") {
            When("when test") {

            }
            Then("then test") {
                assertTrue { true }
            }
        }
    }
})