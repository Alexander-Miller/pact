package org.testit.pact.provider.junit

import au.com.dius.pact.model.Pact

interface PactSource {
    fun loadPacts(providerFilter: String, consumerFilter: String?): List<Pact>
}