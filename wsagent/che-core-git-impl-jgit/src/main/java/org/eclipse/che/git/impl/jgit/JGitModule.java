package org.eclipse.che.git.impl.jgit;

import com.google.inject.AbstractModule;

import org.eclipse.che.api.git.GitConnectionFactory;

/**
 * Guice module to install jgit implementation of git components
 * @author Sergii Kabashnyuk
 */
public class JGitModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(GitConnectionFactory.class).to(JGitConnectionFactory.class);
    }
}
