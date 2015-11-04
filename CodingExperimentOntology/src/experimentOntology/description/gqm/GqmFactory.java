/**
 */
package experimentOntology.description.gqm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.description.gqm.GqmPackage
 * @generated
 */
public interface GqmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GqmFactory eINSTANCE = experimentOntology.description.gqm.impl.GqmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GQM Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GQM Description</em>'.
	 * @generated
	 */
	GQMDescription createGQMDescription();

	/**
	 * Returns a new object of class '<em>Goal GQM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal GQM</em>'.
	 * @generated
	 */
	GoalGQM createGoalGQM();

	/**
	 * Returns a new object of class '<em>Question GQM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question GQM</em>'.
	 * @generated
	 */
	QuestionGQM createQuestionGQM();

	/**
	 * Returns a new object of class '<em>Metric GQM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric GQM</em>'.
	 * @generated
	 */
	MetricGQM createMetricGQM();

	/**
	 * Returns a new object of class '<em>Goals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goals</em>'.
	 * @generated
	 */
	Goals createGoals();

	/**
	 * Returns a new object of class '<em>Questions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questions</em>'.
	 * @generated
	 */
	Questions createQuestions();

	/**
	 * Returns a new object of class '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrics</em>'.
	 * @generated
	 */
	Metrics createMetrics();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GqmPackage getGqmPackage();

} //GqmFactory
