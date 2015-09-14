/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.registry.indexing.indexer;

import org.wso2.carbon.registry.indexing.RegistryConfigLoader;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class IndexerFactory {

    private static IndexerFactory factory;

    protected IndexerFactory() {
    }

    public static IndexerFactory getFactory() {
        if (factory == null) {
            factory = new IndexerFactory();
        }
        return factory;
    }

/*
We are assuming that indexers cannot be added dynamically
    public void addIndexer(String mediaType, Indexer indexer) {
        indexerMap.put(mediaType, indexer);
    }
*/

    //Moved to IndexinManager class
    /*public Indexer getIndexer(String mimeType) throws IndexerException {

        Indexer indexer = null;
        Iterator<String> iterator = indexerMap.keySet().iterator();

        while (iterator.hasNext()) {
            String mediaTypeRegEx = iterator.next();
            if (Pattern.matches(mediaTypeRegEx, mimeType)) {
               // try {
                    //return indexerMap.get(mediaTypeRegEx).getClass().newInstance(); //TODO: Reuse existing ones
                    return indexerMap.get(mediaTypeRegEx);
               // } catch (InstantiationException e) {
               //     throw new IndexerException("Unable to create Indexer instance", e);
               // } catch (IllegalAccessException e) {
               //     throw new IndexerException("Unable to create Indexer instance", e);
               // }
            }
        }
        return indexer;
    }*/


}
