/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.plugin.factory.ide;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

import org.eclipse.che.ide.ui.Styles;
import org.vectomatic.dom.svg.ui.SVGResource;

/**
 * Factory extension resources (css styles, images).
 *
 * @author Ann Shumilova
 * @author Anton Korneta
 */
public interface FactoryResources extends ClientBundle {
    interface FactoryCSS extends CssResource, Styles {
        String label();

        String createFactoryButton();

        String labelErrorPosition();
    }

    interface Style extends CssResource {
        String launchIcon();

        String configureIcon();
    }

    @Source({"Factory.css", "org/eclipse/che/ide/api/ui/style.css", "org/eclipse/che/ide/ui/Styles.css"})
    FactoryCSS factoryCSS();

    @Source("svg/export-config.svg")
    SVGResource exportConfig();

    @Source("svg/import-config.svg")
    SVGResource importConfig();

    @Source("svg/execute.svg")
    SVGResource execute();

    @Source("svg/cog-icon.svg")
    SVGResource configure();
}