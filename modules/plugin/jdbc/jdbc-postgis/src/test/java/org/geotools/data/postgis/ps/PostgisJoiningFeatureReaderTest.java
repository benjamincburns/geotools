/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2013, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.data.postgis.ps;

import org.geotools.jdbc.JDBCJoiningFeatureReaderTest;
import org.geotools.jdbc.JDBCTestSetup;
import org.geotools.data.postgis.PostgisJoinTestSetup;

/**
 * 
 *
 * @source $URL$
 */
public class PostgisJoiningFeatureReaderTest extends JDBCJoiningFeatureReaderTest {

    @Override
    protected JDBCTestSetup createTestSetup() {
        return new PostgisJoinTestSetup(new PostGISPSTestSetup());
    }

}
