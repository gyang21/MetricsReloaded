/*
 * Copyright 2005-2020 Sixth and Red River Software, Bas Leijdekkers
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.sixrr.stockmetrics.projectMetrics;

import com.sixrr.metrics.MetricCalculator;
import com.sixrr.metrics.MetricType;
import com.sixrr.stockmetrics.i18n.HelpURLs;
import com.sixrr.stockmetrics.i18n.StockMetricsBundle;
import com.sixrr.stockmetrics.projectCalculators.AverageCyclomaticComplexityProjectCalculator;
import org.jetbrains.annotations.NotNull;

public class AverageCyclomaticComplexityProjectMetric extends ProjectMetric {

    @NotNull
    @Override
    public String getDisplayName() {
        return StockMetricsBundle.message("average.cyclomatic.complexity.display.name");
    }

    @NotNull
    @Override
    public String getAbbreviation() {
        return StockMetricsBundle.message("average.cyclomatic.complexity.abbreviation");
    }

    @NotNull
    @Override
    public MetricType getType() {
        return MetricType.Average;
    }

    @Override
    public String getHelpURL() {
        return HelpURLs.COMPLEXITY_URL;
    }

    @Override
    public String getHelpDisplayString() {
        return HelpURLs.COMPLEXITY_DISPLAY_STRING;
    }

    @NotNull
    @Override
    public MetricCalculator createCalculator() {
        return new AverageCyclomaticComplexityProjectCalculator(this);
    }
}
