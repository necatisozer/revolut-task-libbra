/*
 * Copyright (C) 2020. Nuh Koca. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.nuhkoca.libbra.domain.repository

import io.github.nuhkoca.libbra.data.Result
import io.github.nuhkoca.libbra.data.datasource.DataSource
import io.github.nuhkoca.libbra.data.enums.Rate
import io.github.nuhkoca.libbra.data.model.domain.CurrencyResponse
import kotlinx.coroutines.flow.Flow

/**
 * A helper interface for repository layer to interact with [DataSource]
 */
@FunctionalInterface
interface Repository {

    /**
     * Fetches list of currencies and returns in [Flow] builder
     *
     * @param continuation indicates flow state. If [RESUME] flow is resumed otherwise paused.
     * @param base The base currency to fetch list
     *
     * @return [CurrencyResponse] within [Flow] builder
     */
    fun getCurrencyList(base: Rate): Flow<Result<CurrencyResponse>>
}
