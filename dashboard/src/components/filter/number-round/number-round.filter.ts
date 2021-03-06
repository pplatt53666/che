/*
 * Copyright (c) 2015-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 */
'use strict';

export class CheNumberRoundFilter {

  constructor(register: che.IRegisterService) {
    register.filter('cheNumberRoundFilter', () => {
      return (number: number, precision: number) => {
        number = parseFloat(number);
        precision = parseInt(precision, 10);

        if (isNaN(number)) {
          return 'NaN';
        }
        if (isNaN(precision)) {
          precision = 0;
        }

        let  factor = Math.pow(10, precision);
        let  tempNumber = number * factor;
        let  roundedTempNumber = Math.round(tempNumber);
        return (roundedTempNumber / factor).toString();
      };
    });
  }
}

