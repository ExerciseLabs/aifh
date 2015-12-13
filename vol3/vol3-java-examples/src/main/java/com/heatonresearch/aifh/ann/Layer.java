/*
 * Artificial Intelligence for Humans
 * Volume 3: Deep Learning and Neural Networks
 * Java Version
 * http://www.aifh.org
 * http://www.jeffheaton.com
 *
 * Code repository:
 * https://github.com/jeffheaton/aifh
 *
 * Copyright 2014-2015 by Jeff Heaton
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
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package com.heatonresearch.aifh.ann;

import com.heatonresearch.aifh.ann.activation.ActivationFunction;
import com.heatonresearch.aifh.ann.train.GradientCalc;
import com.heatonresearch.aifh.randomize.GenerateRandom;

public interface Layer {
    int getCount();
    int getTotalCount();
    ActivationFunction getActivation();
    void finalizeStructure(BasicNetwork theOwner, int theLayerIndex,
                           TempStructureCounts counts);

    void computeLayer();

    void computeGradient(GradientCalc calc);

    int getWeightIndex();

    int getNeuronIndex();

    int getLayerIndexReverse();

    int getLayerIndex();

    void trainingBatch(GenerateRandom rnd);

    BasicNetwork getOwner();

    boolean isActive(int i);

    boolean hasBias();

    int[] getDimensionCounts();

    int getWeightDepthUnit();
    int getNeuronDepthUnit();

}