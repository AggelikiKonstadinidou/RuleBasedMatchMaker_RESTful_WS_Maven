/* CVS $Id: $ */
package gpii.schemas;

import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from C:\eclipse\workspace\JenaTutorial\preferenceVocabular.rdf 
 * @author Auto-generated by schemagen on 25 Mrz 2014 11:49 
 */
public class UPREFS {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://rbmm.org/schemas/accessibility/";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>User requires specific accessibility settings.</p> */
    public static final Resource User = m_model.createResource( "http://rbmm.org/schemas/accessibility/user" );
    
    public static final Resource Environment = m_model.createResource( "http://gpii.org/schemas/accessibility/environment" );
    
    /** <p>inferred Configuration.</p> */
    public static final Property inferredConfiguration = m_model.createProperty( "http://rbmm.org/schemas/accessibility/inferredConfiguration" );

    /** <p>launch Solutions.</p> */
    public static final Resource LaunchSolutions = m_model.createResource( "http://gpii.org/schemas/accessibility/LaunchSolutions" );
    
    
    /** <p>Preferences of a person.</p> */
    public static final Property preference = m_model.createProperty( "http://rbmm.org/schemas/accessibility/preference" );
    
    /** <p>Name of a preference .</p> */
    public static final Property name = m_model.createProperty( "http://rbmm.org/schemas/accessibility/preference/name" );
    
    /** <p>Value of a preference .</p> */
    public static final Property value = m_model.createProperty( "http://rbmm.org/schemas/accessibility/preference/value" );
    
    /** <p>Type of a preference .</p> */
    public static final Property type = m_model.createProperty( "http://rbmm.org/schemas/accessibility/preference/type" );
    
    /** <p> User requires a specific class of AT .</p> */
    public static final Property requiresAT = m_model.createProperty( "http://gpii.org/schemas/accessibility/requiresAT" );
    
    // to distinguish between preferred AT (explicitly though user voting) and used AT (implicitly through app-specific prefs)
    /** <p> User prefers a specific AT product .</p> */
    public static final Property prefersAT = m_model.createProperty( "http://gpii.org/schemas/accessibility/prefersAT" );
 
    /** <p>installed solution in environment.</p> */
    public static final Property installedSolutions = m_model.createProperty( "http://rbmm.org/schemas/accessibility/installedSolutions" );

    
    /** TODO
     *  this should be a sub class of a conflict resource
     *    
     */
    public static final Resource AccessibilityConflict = m_model.createResource();
    
    /**
     * TODO no instances in my accessibility schema! 
     * The goal is that someone else can also use this schema! 
     * I need a place where to instantiate the   
     */
    public static final Literal MultipleSolutionsConflict = m_model.createLiteral("MultipleSolutionsConflict"); 
    
    //public static final Resource  = m_model.createResource( "http://gpii.org/schemas/accessibility#MultipleSolutionsConflict" );
    
    // class to describe accessibility conflicts
    public static final Property has = m_model.createProperty( "http://gpii.org/schemas/accessibility#accessibilityConflict" );
    
    // class to describe certain assistive technology classes  
    public static final Resource ATType = m_model.createResource( "http://gpii.org/schemas/accessibility#ATType" );
    
    public static final Property applyATType = m_model.createProperty( "http://gpii.org/schemas/accessibility#applyATType" );
    
    public static final Property applyATProduct = m_model.createProperty( "http://gpii.org/schemas/accessibility#applyATProduct" );
    
    public static final Property launchSolutions = m_model.createProperty( "http://gpii.org/schemas/accessibility#launchSolutions" );
    
   
}