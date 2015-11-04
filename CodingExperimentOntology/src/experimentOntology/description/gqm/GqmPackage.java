/**
 */
package experimentOntology.description.gqm;

import experimentOntology.description.DescriptionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see experimentOntology.description.gqm.GqmFactory
 * @model kind="package"
 * @generated
 */
public interface GqmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gqm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gqm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gqm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GqmPackage eINSTANCE = experimentOntology.description.gqm.impl.GqmPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.GQMDescriptionImpl <em>GQM Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.GQMDescriptionImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getGQMDescription()
	 * @generated
	 */
	int GQM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION__ABSTRACT = DescriptionPackage.DESCRIBABLE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION__KEYWORDS = DescriptionPackage.DESCRIBABLE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Authorship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION__AUTHORSHIP = DescriptionPackage.DESCRIBABLE__AUTHORSHIP;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION__GOALS = DescriptionPackage.DESCRIBABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION__QUESTIONS = DescriptionPackage.DESCRIBABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION__METRICS = DescriptionPackage.DESCRIBABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GQM Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION_FEATURE_COUNT = DescriptionPackage.DESCRIBABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GQM Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GQM_DESCRIPTION_OPERATION_COUNT = DescriptionPackage.DESCRIBABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.GoalGQMImpl <em>Goal GQM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.GoalGQMImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getGoalGQM()
	 * @generated
	 */
	int GOAL_GQM = 1;

	/**
	 * The feature id for the '<em><b>Related Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_GQM__RELATED_QUESTION = 0;

	/**
	 * The number of structural features of the '<em>Goal GQM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_GQM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Goal GQM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_GQM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.QuestionGQMImpl <em>Question GQM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.QuestionGQMImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getQuestionGQM()
	 * @generated
	 */
	int QUESTION_GQM = 2;

	/**
	 * The feature id for the '<em><b>Related Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GQM__RELATED_METRIC = 0;

	/**
	 * The number of structural features of the '<em>Question GQM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GQM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Question GQM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GQM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.MetricGQMImpl <em>Metric GQM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.MetricGQMImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getMetricGQM()
	 * @generated
	 */
	int METRIC_GQM = 3;

	/**
	 * The feature id for the '<em><b>Related Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_GQM__RELATED_VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Metric GQM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_GQM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metric GQM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_GQM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.GoalsImpl <em>Goals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.GoalsImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getGoals()
	 * @generated
	 */
	int GOALS = 4;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS__GOAL = 0;

	/**
	 * The number of structural features of the '<em>Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.QuestionsImpl <em>Questions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.QuestionsImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getQuestions()
	 * @generated
	 */
	int QUESTIONS = 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS__QUESTION = 0;

	/**
	 * The number of structural features of the '<em>Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.description.gqm.impl.MetricsImpl <em>Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.description.gqm.impl.MetricsImpl
	 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getMetrics()
	 * @generated
	 */
	int METRICS = 6;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS__METRIC = 0;

	/**
	 * The number of structural features of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.GQMDescription <em>GQM Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GQM Description</em>'.
	 * @see experimentOntology.description.gqm.GQMDescription
	 * @generated
	 */
	EClass getGQMDescription();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.gqm.GQMDescription#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goals</em>'.
	 * @see experimentOntology.description.gqm.GQMDescription#getGoals()
	 * @see #getGQMDescription()
	 * @generated
	 */
	EReference getGQMDescription_Goals();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.gqm.GQMDescription#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Questions</em>'.
	 * @see experimentOntology.description.gqm.GQMDescription#getQuestions()
	 * @see #getGQMDescription()
	 * @generated
	 */
	EReference getGQMDescription_Questions();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.description.gqm.GQMDescription#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metrics</em>'.
	 * @see experimentOntology.description.gqm.GQMDescription#getMetrics()
	 * @see #getGQMDescription()
	 * @generated
	 */
	EReference getGQMDescription_Metrics();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.GoalGQM <em>Goal GQM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal GQM</em>'.
	 * @see experimentOntology.description.gqm.GoalGQM
	 * @generated
	 */
	EClass getGoalGQM();

	/**
	 * Returns the meta object for the reference list '{@link experimentOntology.description.gqm.GoalGQM#getRelatedQuestion <em>Related Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Question</em>'.
	 * @see experimentOntology.description.gqm.GoalGQM#getRelatedQuestion()
	 * @see #getGoalGQM()
	 * @generated
	 */
	EReference getGoalGQM_RelatedQuestion();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.QuestionGQM <em>Question GQM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question GQM</em>'.
	 * @see experimentOntology.description.gqm.QuestionGQM
	 * @generated
	 */
	EClass getQuestionGQM();

	/**
	 * Returns the meta object for the reference list '{@link experimentOntology.description.gqm.QuestionGQM#getRelatedMetric <em>Related Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Metric</em>'.
	 * @see experimentOntology.description.gqm.QuestionGQM#getRelatedMetric()
	 * @see #getQuestionGQM()
	 * @generated
	 */
	EReference getQuestionGQM_RelatedMetric();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.MetricGQM <em>Metric GQM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric GQM</em>'.
	 * @see experimentOntology.description.gqm.MetricGQM
	 * @generated
	 */
	EClass getMetricGQM();

	/**
	 * Returns the meta object for the reference list '{@link experimentOntology.description.gqm.MetricGQM#getRelatedVariable <em>Related Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Variable</em>'.
	 * @see experimentOntology.description.gqm.MetricGQM#getRelatedVariable()
	 * @see #getMetricGQM()
	 * @generated
	 */
	EReference getMetricGQM_RelatedVariable();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.Goals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goals</em>'.
	 * @see experimentOntology.description.gqm.Goals
	 * @generated
	 */
	EClass getGoals();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.gqm.Goals#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see experimentOntology.description.gqm.Goals#getGoal()
	 * @see #getGoals()
	 * @generated
	 */
	EReference getGoals_Goal();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.Questions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questions</em>'.
	 * @see experimentOntology.description.gqm.Questions
	 * @generated
	 */
	EClass getQuestions();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.gqm.Questions#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see experimentOntology.description.gqm.Questions#getQuestion()
	 * @see #getQuestions()
	 * @generated
	 */
	EReference getQuestions_Question();

	/**
	 * Returns the meta object for class '{@link experimentOntology.description.gqm.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrics</em>'.
	 * @see experimentOntology.description.gqm.Metrics
	 * @generated
	 */
	EClass getMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.description.gqm.Metrics#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric</em>'.
	 * @see experimentOntology.description.gqm.Metrics#getMetric()
	 * @see #getMetrics()
	 * @generated
	 */
	EReference getMetrics_Metric();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GqmFactory getGqmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.GQMDescriptionImpl <em>GQM Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.GQMDescriptionImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getGQMDescription()
		 * @generated
		 */
		EClass GQM_DESCRIPTION = eINSTANCE.getGQMDescription();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GQM_DESCRIPTION__GOALS = eINSTANCE.getGQMDescription_Goals();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GQM_DESCRIPTION__QUESTIONS = eINSTANCE.getGQMDescription_Questions();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GQM_DESCRIPTION__METRICS = eINSTANCE.getGQMDescription_Metrics();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.GoalGQMImpl <em>Goal GQM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.GoalGQMImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getGoalGQM()
		 * @generated
		 */
		EClass GOAL_GQM = eINSTANCE.getGoalGQM();

		/**
		 * The meta object literal for the '<em><b>Related Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_GQM__RELATED_QUESTION = eINSTANCE.getGoalGQM_RelatedQuestion();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.QuestionGQMImpl <em>Question GQM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.QuestionGQMImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getQuestionGQM()
		 * @generated
		 */
		EClass QUESTION_GQM = eINSTANCE.getQuestionGQM();

		/**
		 * The meta object literal for the '<em><b>Related Metric</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_GQM__RELATED_METRIC = eINSTANCE.getQuestionGQM_RelatedMetric();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.MetricGQMImpl <em>Metric GQM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.MetricGQMImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getMetricGQM()
		 * @generated
		 */
		EClass METRIC_GQM = eINSTANCE.getMetricGQM();

		/**
		 * The meta object literal for the '<em><b>Related Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_GQM__RELATED_VARIABLE = eINSTANCE.getMetricGQM_RelatedVariable();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.GoalsImpl <em>Goals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.GoalsImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getGoals()
		 * @generated
		 */
		EClass GOALS = eINSTANCE.getGoals();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOALS__GOAL = eINSTANCE.getGoals_Goal();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.QuestionsImpl <em>Questions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.QuestionsImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getQuestions()
		 * @generated
		 */
		EClass QUESTIONS = eINSTANCE.getQuestions();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONS__QUESTION = eINSTANCE.getQuestions_Question();

		/**
		 * The meta object literal for the '{@link experimentOntology.description.gqm.impl.MetricsImpl <em>Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.description.gqm.impl.MetricsImpl
		 * @see experimentOntology.description.gqm.impl.GqmPackageImpl#getMetrics()
		 * @generated
		 */
		EClass METRICS = eINSTANCE.getMetrics();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRICS__METRIC = eINSTANCE.getMetrics_Metric();

	}

} //GqmPackage
