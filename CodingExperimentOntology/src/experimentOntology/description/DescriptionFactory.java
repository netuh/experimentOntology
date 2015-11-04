/**
 */
package experimentOntology.description;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.description.DescriptionPackage
 * @generated
 */
public interface DescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescriptionFactory eINSTANCE = experimentOntology.description.impl.DescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns a new object of class '<em>Simple Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Abstract</em>'.
	 * @generated
	 */
	SimpleAbstract createSimpleAbstract();

	/**
	 * Returns a new object of class '<em>Structured Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Abstract</em>'.
	 * @generated
	 */
	StructuredAbstract createStructuredAbstract();

	/**
	 * Returns a new object of class '<em>Keywords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keywords</em>'.
	 * @generated
	 */
	Keywords createKeywords();

	/**
	 * Returns a new object of class '<em>Traditional Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traditional Description</em>'.
	 * @generated
	 */
	TraditionalDescription createTraditionalDescription();

	/**
	 * Returns a new object of class '<em>Questions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questions</em>'.
	 * @generated
	 */
	Questions createQuestions();

	/**
	 * Returns a new object of class '<em>Research Hypotheses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Hypotheses</em>'.
	 * @generated
	 */
	ResearchHypotheses createResearchHypotheses();

	/**
	 * Returns a new object of class '<em>Simple Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Goal</em>'.
	 * @generated
	 */
	SimpleGoal createSimpleGoal();

	/**
	 * Returns a new object of class '<em>Structured Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Goal</em>'.
	 * @generated
	 */
	StructuredGoal createStructuredGoal();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Authors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authors</em>'.
	 * @generated
	 */
	Authors createAuthors();

	/**
	 * Returns a new object of class '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword</em>'.
	 * @generated
	 */
	Keyword createKeyword();

	/**
	 * Returns a new object of class '<em>Simple Research Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Research Question</em>'.
	 * @generated
	 */
	SimpleResearchQuestion createSimpleResearchQuestion();

	/**
	 * Returns a new object of class '<em>Simple Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Hypothesis</em>'.
	 * @generated
	 */
	SimpleHypothesis createSimpleHypothesis();

	/**
	 * Returns a new object of class '<em>Goals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goals</em>'.
	 * @generated
	 */
	Goals createGoals();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DescriptionPackage getDescriptionPackage();

} //DescriptionFactory
